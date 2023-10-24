import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LingkaranTest {



    @Test
    public void positifLingkaran(){
        //Lingkaran lingkaran = new Lingkaran();
        assertEquals(50.24,Lingkaran.hitungLuas(4));
    }

    @Test
    void NegatifLingkaran(){
        //Lingkaran lingkaran = new Lingkaran();
        assertThrows(IllegalArgumentException.class, () -> {Lingkaran.hitungLuas(-4);});
    }

    @Test
    void LingkaranZero(){
        //Lingkaran lingkaran = new Lingkaran();
        assertThrows(IllegalArgumentException.class, () -> {Lingkaran.hitungLuas(0);});
    } 
}