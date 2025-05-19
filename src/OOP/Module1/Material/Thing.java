package OOP.Module1.Material;

public class Thing {
    private String name;
    private Material material;
    private double volume;

    public Thing() {
    }

    public Thing(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return material.getDensity() * volume;
    }

    public void show() {
        System.out.println(name + ";" + material.getMaterial() + ";" + material.getDensity()
                + ";" + volume + ";" + getMass());
    }
}
