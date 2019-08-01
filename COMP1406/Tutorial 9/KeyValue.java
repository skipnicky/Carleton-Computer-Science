package comp1406t9;

public class KeyValue implements Comparable<KeyValue>{
    public String key;
    public Integer value;

    public KeyValue(String k, Integer v){
      key = k;
      value = v;
    }

    @Override
    public String toString(){
      return(key+":"+value);
    }

    public String getKey(){
      return key;
    }

    @Override
    public int compareTo(KeyValue other){
      return value.compareTo(other.value);
    }

}
