package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Servidor {

public static final int TIMEOUT = 300;

/**
 *
 * Servidor
 *
 * @author Paulo Henrique Caviquioli
 * @since 19/09/2022, 11:35:11
 *
 */
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var consultarStatus = Var.VAR_NULL;

   public Var call() throws Exception {
    consultarStatus =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.Participantes"),Var.valueOf("select p.status_Participante.nome_Status from Participantes p where p.user.userName = :userUserName"),Var.valueOf("userUserName",
    cronapi.util.Operations.getCurrentUserName()))));
    System.out.println(consultarStatus.getObjectAsString());
    return consultarStatus;
   }
 }.call();
}

}

