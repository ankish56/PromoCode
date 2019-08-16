import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { AddPromoComponent} from './addPromo';
import { ShowComponent } from './showPromo';
import {FormsModule} from '@angular/forms';
import {Routes,RouterModule} from '@angular/router';
import {HttpClientModule} from '@angular/common/http';

import { DeleteComponent } from './delete';

const routes:Routes=[
    {path:'',redirectTo:'show',pathMatch:'full'},
    {path:'add',component:AddPromoComponent},
    {path:'show',component:ShowComponent}, 
    {path:'delete',component:DeleteComponent},
    {path:'**',redirectTo:'show'}
];
@NgModule({
    imports: [
        BrowserModule,FormsModule,RouterModule.forRoot(routes),HttpClientModule
        
    ],
    declarations: [
        AppComponent,AddPromoComponent,ShowComponent,DeleteComponent
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }
