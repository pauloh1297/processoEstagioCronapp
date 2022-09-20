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
 * @author Paulo Henrique Caviquioli
 * @since 19/09/2022, 16:43:53
 *
 */
public static Var DataFim() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;
   private Var Aprovado = Var.VAR_NULL;
   private Var Reprovado = Var.VAR_NULL;
   private Var teste = Var.VAR_NULL;

   public Var call() throws Exception {
    cronapi.util.Operations.sleep(
    Var.valueOf(2));
    item =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Participantes.active.status_Participante_nome_Status"));
    System.out.println(item.getObjectAsString());
    Aprovado =
    Var.valueOf("Aprovado");
    Reprovado =
    Var.valueOf("Reprovado");
    teste =
    Var.valueOf(item.equals((
    Var.valueOf(Aprovado.getObjectAsBoolean() || Reprovado.getObjectAsBoolean()))));
    System.out.println(teste.getObjectAsString());
    if (
    Var.valueOf(
    Var.valueOf(item.equals(Aprovado)).getObjectAsBoolean() ||
    Var.valueOf(item.equals(Reprovado)).getObjectAsBoolean()).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("Participantes.active.dataFim"),
        cronapi.dateTime.Operations.formatDateTime2(
        cronapi.dateTime.Operations.getNow(),
        Var.valueOf(""),
        Var.valueOf(-3),
        Var.valueOf("true")));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("Participantes.active.calculoHora"),
        cronapi.dateTime.Operations.getHoursBetweenDates(
        cronapi.dateTime.Operations.formatDateTime2(
        cronapi.dateTime.Operations.getNow(),
        Var.valueOf(""),
        Var.valueOf(-3),
        Var.valueOf("true")),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("Participantes.active.dataInicio"))));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * DataHora
 *
 * @author Paulo Henrique Caviquioli
 * @since 19/09/2022, 16:43:53
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
    Var.valueOf("false"));
    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Participantes.active.dataInicio"))).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("Participantes.active.dataInicio"), item);
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

