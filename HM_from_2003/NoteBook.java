public class NoteBook {
    String Name;
    int OZY;
    int GD;
    String Color;

    public NoteBook(String Name, int OZY, int GD, String Color) {
        this.Name = Name;
        this.OZY = OZY;
        this.GD = GD;
        this.Color = Color;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getOZY() {
        return this.OZY;
    }

    public void setOZY(int OZY){
        this.OZY = OZY;
    }

    public int getGD() {
        return this.GD;
    }

    public void setGD(int GD){
        this.GD = GD;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
}