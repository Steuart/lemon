$(document).ready(function () {

    var converter = new showdown.Converter();
    showdown.setOption('optionKey', 'value');
    var getIt = function (id) {
        return document.getElementById(id);
    };
    new Editor(getIt("markdown"), getIt("preview"),converter);

    /*按钮点击事件*/
    var showFlag = true;
    $("#gear").click(function () {
        if(!showFlag){
            $(".operate").css("right","-20%");
            showFlag = true
        }else{
            $(".operate").css("right","0");
            showFlag = false;
        }
    });

    $("#edit").click(function () {
        $(".operate").css("right","-20%");
        showFlag = true
    });

    var addTagShowFlag = false;
    $("#add-tag").click(function () {
        if(!addTagShowFlag){
            $(".tags-container").show();
            $(".mask").show();
            addTagShowFlag = true;
        }else{
            $(".tags-container").hide();
            $(".mask").hide();
            addTagShowFlag = false;
        }
    });
    
    $("#mask").click(function () {
        $(".tags-container").hide();
        $(".mask").hide();
        addTagShowFlag = false;
    });

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