import { Component} from "@angular/core";
import {PromoService} from './app.PromoService';
import {Promo} from './models/Promo';

@Component({
    selector:'delete',
    templateUrl:'delete.html'
})

export class DeleteComponent {
    
    promocodeId:number
    prom:Promo
    constructor(private service:PromoService){}
    Delete()
    {
       this.service.delete(this.promocodeId).subscribe(
        res=>{this.prom=res
       }
    
           
       )
    }
    ch=false;
    change()
    {
        this.ch=true;
    }

    
    
}