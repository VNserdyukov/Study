package OOP.Module1.Material;

public class Material {
    private String material;
    private int density;

    public Material(String material, int density) {
        this.material = material;
        this.density = density;
    }

    public String getMaterial() {
        return material;
    }

    public int getDensity() {
        return density;
    }

}
