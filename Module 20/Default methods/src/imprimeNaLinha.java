package Default_methods.src;

import java.util.function.Consumer;

public class imprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
    
}
