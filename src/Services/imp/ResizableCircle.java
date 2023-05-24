package Services.imp;

import Services.Resizable;

public class ResizableCircle extends Circle implements Resizable {

//    public ResizableCircle(double radius) {
//        super(radius);
//    }

    @Override
    public double resize(double percent) {

        return super.radius * ((100+percent)/100.0);
    }
}
