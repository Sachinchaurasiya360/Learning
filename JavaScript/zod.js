const express=require('express');
const app=express();
const port=3000;
const zod=require('zod');

app.use(express.json());

const userscema=zod.scema;

