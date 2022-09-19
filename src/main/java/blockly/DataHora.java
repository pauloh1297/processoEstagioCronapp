package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class DataHora {

public static final int TIMEOUT = 300;

/**
 *
 * DataHora
 *
 * @author Paulo Henrique Caviquioli
 * @since 19/09/2022, 15:37:17
 *
 */
public static Var HoraInicio() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.dateTime.Operations.formatDateTime2(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf(""),
    Var.valueOf(-3),
    Var.valueOf("true"));
    cronapi.database.Operations.update(Var.VAR_NULL,);
    return Var.VAR_NULL;
   }
 }.call();
}

}

