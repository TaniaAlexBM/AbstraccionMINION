package tareas.Minion;

public class MinionGS {
    public float estatura;
    public int ojos;
    public String colorOjos;

    public float getEstatura(){  return estatura;  }
    public int getojos(){  return ojos;  }
    public String getColorOjos(){  return colorOjos;  }

    public boolean setEstatura( float estatura ){
        if(estatura > 0){
            this.estatura = estatura;
            return true;
        }else
            return false;
    }
    public boolean setojos( int ojos ){
        if (ojos > 0){
            this.ojos = ojos;
            return true;
        }else
            return false;
    }
    public boolean setcolorOjos(String colorOjos){
        if(!colorOjos.isEmpty()){ // !: diferente de o está vacío
            this.colorOjos = colorOjos;
            return true;
        } else
            return false;
    }

    public String printState(){
        return "Número de ojos: " + ojos +
                "\nColor de ojos: " + colorOjos +
                "\nEstatura: " + estatura;
    }
}