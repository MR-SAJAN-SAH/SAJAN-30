/*Illustrate the execution of constructors in multi-level inheritance
with three Java classes – plate(length, width), box(length, width, height), wood box (length,
width, height, thick) where box inherits from plate and woodbox inherits from box class.
Each class has constructor where dimensions are taken from user.*/

package lab4;
class plate{
    int length;
    int width;

    public plate(int l,int w){
        this.length=l;
        this.width=w;
    }
}

class box2 extends plate{
    int height;
    public box2(int l,int w, int h){
        super(l,w);
        this.height=h;
    }
}

class woodBox extends box2 {
    int thick;

    public woodBox(int l, int b, int w, int t) {
        super(l, b, w);
        this.thick = t;
    }

    void display() {
        System.out.println(super.height + " is height\n" + super.length + " is length\n" + super.width + " is width\n" + this.thick + " is thickness");
    }
}
    public class a2 {
        public static void main(String[] args) {
            woodBox w = new woodBox(1, 2, 3, 4);
            w.display();
        }
    }
