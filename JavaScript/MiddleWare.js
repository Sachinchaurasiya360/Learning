//Write a code without using middleware for authentication and test it using postman

const express = require("express");
const port = 3000;
const app = express();

app.use(express.json());



function authen(){}
app.get("/", (req, res) => {
  res.send("Welcome to Home Page");
});
app.get("/json", (req, res) => {
  res.json({
    name: "Sachin",
    Class: "12th",
  });
});

app.get("/about",authen, (req, res) => {
    let name=req.query.name
    if (name=="Sachin"){
        res.send(`Welcome ${name} to About Page`);}

    else{
        res.send("You are not authorized to view this page")

    }})

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
