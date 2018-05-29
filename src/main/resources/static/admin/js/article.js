$(document).ready(function () {

    var converter = new showdown.Converter();
    showdown.setOption('optionKey', 'value');
    var getIt = function (id) {
        return document.getElementById(id);
    };
    new Editor(getIt("markdown"), getIt("preview"),converter);

});

function Editor(input, preview,converter) {
    this.update = function () {
        preview.innerHTML = converter.makeHtml(input.value);
    };
    input.editor = this;
    this.update();
}


function tab(obj){
    var keyCode = event.keyCode;
    switch(keyCode){
        case 9:
            obj.value = obj.value + "    "; // 跳几格由你自已决定
            event.returnValue = false;
            break;
        case 13:
            obj.value = obj.value + "  \n";
            event.returnValue = false;
            break;
        default:

    }
}