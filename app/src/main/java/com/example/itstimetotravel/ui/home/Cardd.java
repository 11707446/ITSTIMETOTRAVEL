package com.example.itstimetotravel.ui.home;

class Cardd {
   private int Mimage;
   private  String Mname;

    public Cardd(int mimage,String mname) {
        Mimage = mimage;
        Mname = mname;
    }

    public int getMimage() {
        return Mimage;
    }

    public void setMimage(int mimage) {
        Mimage = mimage;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }
}
