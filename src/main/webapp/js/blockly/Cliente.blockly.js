window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Cliente = window.blockly.js.blockly.Cliente || {};

/**
 * @function Executar
 *
 * Cliente
 *
 *
 * @author Paulo Henrique Caviquioli
 * @since 19/09/2022, 11:34:36
 *
 */
window.blockly.js.blockly.Cliente.ExecutarArgs = [];
window.blockly.js.blockly.Cliente.Executar = async function() {
 var item;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Servidor:Executar', async function(sender_item) {
      item = sender_item;
    //
    if (item == 'Em processo de avaliação') {
      //
      console.log('EntrouExibir');
      //
      this.cronapi.screen.showComponent("adicionarDocumentos");
    } else {
      //
      console.log('EntrouEsconder');
      //
      this.cronapi.screen.hideComponent("adicionarDocumentos");
    }
  }.bind(this));
}
