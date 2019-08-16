import { Component, OnInit } from "@angular/core";
import {PromoService} from './app.PromoService';
import { Promo } from "./models/Promo";
@Component({
    selector:'add-promo',
    templateUrl:'addPromo.html'
})


export class AddPromoComponent implements OnInit{
    
    promocodeId:number;
    promocode:string;
    prom:Promo
    constructor(private service:PromoService){}
    ngOnInit(){}
  
    save()
    {
       
        var  pro:Promo=new Promo(this. promocodeId,this.promocode);
        console.log(pro);
        this.service.addpromo(pro).subscribe(
            res=>{
                this.prom=res
            }
        );     
    }   
    ch=false;
    change(){
        this.ch=true;
    } 
}