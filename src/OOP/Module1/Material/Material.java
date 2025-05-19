package OOP.Module1.Material;

public class Material {
    private final String MATERIAL;
    private final int DENSITY;

    public Material(String material, int density) {
        this.MATERIAL = material;
        this.DENSITY = density;
    }

    public String getMATERIAL() {
        return MATERIAL;
    }

    public int getDENSITY() {
        return DENSITY;
    }

}
