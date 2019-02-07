 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        int newAngle = angle;
        while (newAngle <= -100) newAngle += 360;
        while (newAngle > 100) newAngle -=360;
        return newAngle;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        integer %= 360;
        if (integer < -100) integer += 360;
        else if (integer > 100) integer -= 360;
        
        return integer;
    }

    public static void main(String[] args){

    }
}
