const express=require('express');
const app=express();
const port = 3000;
let aaa=0;
function add(a){
    for(let i=0;i<a;i++){
        aaa=aaa+i;
    }
    return aaa;
}


app.get('/',function(req,res){  //req=request res=response
    const userQuery=parseInt(req.query.UserInput);
    const Ans=add(userQuery);

    res.send("Your answer is "+Ans);
});

app.listen(port, function(){
    console.log('Server started on http://localhost:'+port);
});

//http://localhost:3000/?UserInput=7