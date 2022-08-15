import java.util.HashMap;

public class TablaHash {
    
    private HashMap <Integer, User>[] registros;
    private static int tamaño = 0;
    private final int M = 5; //Cantidad de índices, un núm primo
    
    public TablaHash() {
        
        //Se crea el arreglo con la medida según cantidad de índices (M)
        registros = new HashMap[M];
        for (int i = 0; i < M; i++) {
            //Por cada posición del arreglo se crea HashMap para los datos
            registros[i] = new HashMap <Integer, User>();
        }
    }
    
    public int size() {
        return tamaño;
    }

    public boolean isEmpty() {
        return (tamaño == 0);
    }

    public boolean containsKey(Integer key) {
        
        //Se obtiene el indice del arreglo por medio del módulo
        int ind = Math.abs(key) % M;
        
        //Se evalúa en cada HashMap de la posición del arreglo (por "ind")
        for (Integer k : registros[ind].keySet()) {
            if (k.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(User value) {
        
        //Se evalúa por cada posición del arreglo y luego se verifica si el HashMap contiene el "value"
        for(int i = 0; i < M; i++) {
            if (registros[i].containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    public User get(Integer key) {
        
        //Se obtiene el indice del arreglo por medio del módulo
        int ind = Math.abs(key) % M;
        
        //Se evalua por el HashMap requerido para obtener el user
        for (Integer k : registros[ind].keySet()) {
            if (k.equals(key)) {
                return registros[ind].get(key);
            }
        }
        return null;
    }

    public boolean put(Integer key, User value) {
        
        //Se obtiene el indice del arreglo por medio del módulo
        int ind = Math.abs(key) % M;
        
        //Se verifica que no exista ya el usuario, luegeo se agrega
        if (registros[ind].containsKey(key) == false) {
            registros[ind].put(key, value);
            tamaño++;
            return true;
        }
        return false;
    }

    public boolean remove(Integer key) {
        
        //Se obtiene el indice del arreglo por medio del módulo
        int ind = Math.abs(key) % M;
        
        //Se recorre el HashMap escogidod por "ind" y si el key coincide lo elimina
        for (Integer k : registros[ind].keySet()) {
            if (k.equals(key)) {
                registros[ind].remove(key);
                return true;
            }
        }
        
        return false;
    }
    
    public void clear() {
        registros = null;
        tamaño = 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = M;
        result = prime * result + ((registros == null) ? 0 : registros.hashCode());
        
        return result;
    }
    
    @Override
    public String toString() {
        
        //Se retornan los datos del usuario así como el código, y por orden de su índice en la tabla
        if (tamaño == 0) {
            return "La tabla no posee elementos.";
        } else {
            String t = "\t" + "CÓDIGO \t\t" + "NOMBRE \t" + "ID \t" + "GMAIL\n";
            int j = 1;
            
            for (int i = 0; i < M; i++) {
                
                t += i;
                for (Integer k : registros[i].keySet()) {
                    t += "  -->\t" + k +"\t" + registros[i].get(k);
                }
                t += "\n";
            }
            return t;
        }
    }
}
