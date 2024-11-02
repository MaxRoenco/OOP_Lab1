package task1;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public float getPpi() {
        return ppi;
    }
    public String getModel() {
        return model;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setPpi(float ppi) {
        this.ppi = ppi;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void compareSize(Display m) {
        if(this.width * this.height > m.getWidth() * m.getHeight()) {
            System.out.println(this.getModel() +  " is bigger");
        } else if (this.width * this.height < m.getWidth() * m.getHeight()) {
            System.out.println( m.getModel() + " is bigger");
        } else{
            System.out.println("Have the same size");
        }
    }

    public void compareSharpness(Display m) {
        if(this.ppi > m.getPpi()) {
            System.out.println(this.getModel() +  " has more ppi");
        } else if (this.ppi < m.getPpi()) {
            System.out.println(this.getModel() +  " has more ppi");
        } else{
            System.out.println("Have the same ppi");
        }
    }

    public void compareWithMonitor(Display m) {
        this.compareSize(m);
        this.compareSharpness(m);
    }


}
