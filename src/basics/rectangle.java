package basics;

public class rectangle {
    int length;
    int width;
    rectangle(int length,int width){
        this.length=length;
        this.width=width;

    }
    void display(){
        System.out.println("area="+length*width);
    }
}
