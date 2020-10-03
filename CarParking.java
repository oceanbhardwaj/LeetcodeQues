class ParkingSystem {
   HashMap<Integer,Integer> h;
    public ParkingSystem(int big, int medium, int small) {
    h=new HashMap<>();
        h.put(1,big);
        h.put(2,medium);
        h.put(3,small);
        
        
    }
    
    public boolean addCar(int carType) {
        if(carType==1 && h.get(1)>=1)
        {h.put(1,h.get(1)-1);
            return true;}
        else if(carType==2 && h.get(2)>=1)
        {
             h.put(2,h.get(2)-1);
            return true;
        }
        else if(carType==3 && h.get(3)>=1)
        {
             h.put(3,h.get(3)-1);
            return true;
        }
        return false;
    }
}