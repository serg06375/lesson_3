package App;

public class Main {

    public static void main(String[] args) {
        //Ограничения - статичные поля
//Класс наследованный от Throwable

//несколько параметров
        public interface Connector<T, U>{
            public void doSmt(T obj, U obj2);
        }

//обобщение с ограничением
        public static class Box<T extends Number>{
            private T object;

            public Box(T object){
                this.object = object;
            }

            public T getObject() {
                return this.object;
            }

            //метасимволы
            public Box<?> setObject(Box<?> object) {
                return object;
            }

            @Override
            public String toString(){
                return "Box: "
                        + "type "+ this.object.getClass().getSimpleName()
                        + " object " + this.object;
            }

        }

        public static void main(String[] args) {
            Box<Integer> box1 = new Box<>(10);
            Box<Double> box2 = new Box<>(10.0);
            double a = (Integer) 5 + (Double) 2.1;
            System.out.println(a);
            System.out.println(box1.toString());
            System.out.println(box2.toString());

        }
    }
    }

