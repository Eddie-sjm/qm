function IsPC() {
    var userAgentInfo = navigator.userAgent;
    var Agents = ["Android", "iPhone",
        "SymbianOS", "Windows Phone"];
    var flag = true;
    for (var v = 0; v < Agents.length; v++) {
        if (userAgentInfo.indexOf(Agents[v]) > 0) {
            flag = false;
            break;
        }
    }
    return flag;
}

var flag = IsPC();
if(flag === true){
    console.log("pc端");
    $(function () {
        $(window).scrollTop(0);
    });
    window.addEventListener('scroll', function (x) {
            if(window.scrollY > 0){
                $('.top-bar').addClass('sticky')
            }else{
                $('.top-bar').removeClass('sticky')
            }
        }
    )
    $(document).ready(function () {
        $("#toindexHead").click(function () {
            $("html, body").animate({
                scrollTop: $("#indexHead").offset().top
            }, {duration: 700, easing: "swing"});
            return false;
        });
        $("#toproductService").click(function () {
            $("html, body").animate({
                scrollTop: $("#productService").offset().top-60
            }, {duration: 700, easing: "swing"});
            return false;
        });
        $("#toadvantage").click(function () {
            $("html, body").animate({
                scrollTop: $("#advantage").offset().top-60
            }, {duration: 700, easing: "swing"});
            return false;
        });
        $("#togreatestCase").click(function () {
            $("html, body").animate({
                scrollTop: $("#greatestCase").offset().top-60
            }, {duration: 700, easing: "swing"});
            return false;
        });
    });
    //写pc端js代码
}else{
    $('.top-bar').addClass('sticky')
    $('#navButton').click(function () {
        $('#topBefore').toggle();
    })
    $('.nav-item > a').click(function () {
        $('#topBefore').hide();
    })
    $(document).ready(function () {
        $("#toindexHead").click(function () {
            $("html, body").animate({
                scrollTop: $("#indexHead").offset().top
            }, {duration: 700, easing: "swing"});
            return false;
        });
        $("#toproductService").click(function () {
            $("html, body").animate({
                scrollTop: $("#productService").offset().top-50
            }, {duration: 700, easing: "swing"});
            return false;
        });
        $("#toadvantage").click(function () {
            $("html, body").animate({
                scrollTop: $("#advantage").offset().top-50
            }, {duration: 700, easing: "swing"});
            return false;
        });
        $("#togreatestCase").click(function () {
            $("html, body").animate({
                scrollTop: $("#greatestCase").offset().top-50
            }, {duration: 700, easing: "swing"});
            return false;
        });
    });
    let $window  = $('.m-window')
    $window.on('touchmove', function(event) {
        event.preventDefault();
    });
    $('.m-info-close').click(function () {
        setTimeout(function () {
            $window.css('visibility', 'hidden');
            $('.m-window-content').removeClass('m-window-animation')
        }, 1);
    })
    $(".case-item").click(function(){
        let i = $(this).index()
        $window.eq(i).css('visibility', 'visible')
        $('.m-window-content').addClass('m-window-animation')
    });


//写移动端js代码
}

!function (){
    findClosest()
    window.addEventListener('scroll', function(x){
        findClosest()
    })


    /* helper */
    function findClosest(){
        let specialTags = document.querySelectorAll('[data-x]')
        let minIndex = 0
        for(let i =1;i<specialTags.length; i++){
            if(Math.abs(specialTags[i].offsetTop - window.scrollY) < Math.abs(specialTags[minIndex].offsetTop - window.scrollY)){
                minIndex = i
            }
        }
        let a = document.querySelectorAll('.nav-item > a')
        for (var i = 0; i < a.length ;i++){
            if ('to' + specialTags[minIndex].id === a[i].id){
                $('.nav-item').removeClass('li-active')
                $('.nav-item').eq(i).addClass('li-active')
            }
        }
    }
}.call()
