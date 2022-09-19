package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Usuario {

public static final int TIMEOUT = 300;

/**
 *
 * usuario
 *
 * @param Entidade<app.entity.Participantes>
 *
 * @author Paulo Henrique Caviquioli
 * @since 19/09/2022, 10:06:44
 *
 */
public static Var ObterLogin(@ParamMetaData(description = "Entidade", id = "f542584a") Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.util.Operations.getCurrentUserName();
   }
 }.call();
}

}

