const{test,expect}=require('@playwright/test');
const {Pomadactin}=require('../POM/Adactin');

test('demo',async({browser})=>{
const b= await browser.newContext();
const page= await b.newPage();

await page.goto("https://adactinhotelapp.com/",{waitUntil:'load'});
const obj=new Pomadactin(page);
await obj.loginpage();
await obj.searchHotelpage();
await obj.selectHotel();
await obj.BookAHotel();


});