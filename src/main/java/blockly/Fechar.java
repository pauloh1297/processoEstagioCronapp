package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Fechar {

public static final int TIMEOUT = 300;

/**
 *
 * fechar
 *
 * @author Paulo Henrique Caviquioli
 * @since 19/09/2022, 22:09:16
 *
 */
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
    Var.valueOf(""));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @author Paulo Henrique Caviquioli
 * @since 19/09/2022, 22:09:16
 *
 */
public static void fa_C3_A7a_algo() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
    Var.valueOf("starter"));
   return Var.VAR_NULL;
   }
 }.call();
}

}

