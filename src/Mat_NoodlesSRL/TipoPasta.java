
package Mat_NoodlesSRL;

public enum TipoPasta {
    
    FIDEOS_AL_HUEVO(true),
    ÑOQUIS(true),
    RAVIOLES(false),
    AGNOLOTIS(false);
    
    private final boolean porKg;
    
    TipoPasta(boolean porKg) {
        this.porKg = porKg;
    }

    public boolean isPorKg() {
        return porKg;
    }
}
