import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import {Observable} from 'rxjs';
import {Promo} from './models/Promo';

let baseUrl = "http://localhost:5000";

@Injectable({
    providedIn:'root'
})

export class PromoService{
    constructor(private http:HttpClient){}

    acc:Promo;
    addpromo(pro: Promo) :Observable<Promo> 
    {
        let options = { "headers": 
                    new HttpHeaders({"Content-Type": "application/json" }) };
         return this.http.post<Promo>("http://localhost:5000"+ "/new",pro,options);
    }

    getemployee()
    {       
          return this.http.get<Promo[]>(baseUrl+"/promos");
    }
  
    delete(promocodeId:number)
    {
        let options = { "headers": 
        new HttpHeaders({"Content-Type": "application/json" }) };
        return this.http.delete<Promo>(baseUrl+"/delete"+promocodeId,options);

    }
    
}

   