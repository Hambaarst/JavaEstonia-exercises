public enum Planets {
    MERCURY("Mercury","Tiny",57909),
    VENUS("Venus","Small",108160),
    EARTH("Earth","Small",149600),
    MARS("Mars","Small",227990),
    JUPITER("Jupiter","Huge",778360),
    SATURN("Saturn","Huge",1433500),
    URANUS("Uranus","Big",2872400),
    NEPTUNE("Neptune","Big",4498400);

    Planets() {
    }
    String name;
    String size;
    long distance;
    Planets(String name, String size, long distance) {
        this.name = name;
        this.size = size;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public long distanceFromEarth(){
        if (this.distance <= Planets.EARTH.distance){
            return (Planets.EARTH.distance-this.distance)*1000;
        }else {
            return (this.distance-Planets.EARTH.distance)*1000;
        }
    }
    @Override
    public String toString() {
        return size +" "+name;
    }
}
