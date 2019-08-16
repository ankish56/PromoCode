import { Component,} from "@angular/core";
import {PromoService} from './app.PromoService';
import {Promo} from './models/Promo';

@Component({
    selector:'show-promo',
    templateUrl:'showpromo.html'
})

export class ShowComponent {
    constructor(private service:PromoService){}
    prom:Promo[]=[];
    ngOnInit(): void {
        //throw new Error("Method not implemented.");
        this.service.getemployee().subscribe(
            res=>{
               this.prom=res

            },
            err=>{
                alert("an error has occurred")
            }
        )
       } 


    
    
}