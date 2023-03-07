import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //array diferencia
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(8);
        lista.add(7);
        System.out.println(maximaDiferencia(lista));
        System.out.println("---------------------");
        // map
        Map<String, String>  map=  new HashMap<>();
        map.put("usuario", "123");
        map.put("user", "hola");
        map.put("juan","manuel");
        map.put("login","login");
        ingresoMap(map);
        System.out.println("---------------------");
        // suma elementos en una lista
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(3);
        lista2.add(7);
        suma(lista2,10);
        suma(lista2,4);
        suma(lista2,2);

    }

    private static int maximaDiferencia(ArrayList<Integer> lista){
        int restaMax = 0;
        for(int i=0;i<lista.size();i++){
            for(int j=1;j<lista.size();j++){
                if(lista.get(i)>lista.get(j)){
                    int aux = lista.get(i)-lista.get(j);
                    if(aux>restaMax) restaMax = aux;
                }
            }
        }
        if(restaMax!=0) return restaMax;
        return -1;
    }
    private static void ingresoMap(Map<String,String> usuarios){
        int intentos = 4;
        System.out.println("Ingrese el usuario");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();
        if(usuarios.containsKey(user)){
            while(intentos>0){
                System.out.println("Ingrese la contrasena");
                String password = input.nextLine();
                    if(usuarios.get(user).equals(password)){
                        System.out.println("Ha accedido correctamente");
                        return;
                    } else{
                        System.out.println("Clave incorrecta");
                        intentos--;
                    }
            }
        } else{
            System.out.println("Este usuario no existe");
            return;
        }
        System.out.println("Ha alcanzado el limite de intentos");
    }
    private static void suma(ArrayList<Integer> lista, int k){
        for(int i=0;i<lista.size();i++){
            for(int j=1;j<lista.size();j++){
                    int aux = lista.get(i)+lista.get(j);
                    if(aux==k){
                        System.out.println("Si");
                        return;
                }
            }
        }
        System.out.println("NO");
    }
}