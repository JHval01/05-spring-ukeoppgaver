$(() => {
    $("#load").click(() => {
        $.post("load", (data, status) => {
            console.log(status);
            if(status == "succsess"){
                alert("Valuttaene er lastet")
            } else{
                alert("Valuttaene er ikke lastet")
            }
        })
    })
})