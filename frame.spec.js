const{test,expect}= require('@playwright/test');
test('demo',async({browser})=>{
const b =await browser.newContext();
const page= await b.newPage();
await page.goto("https://www.amazon.com/",{waitUntil:'load'});
await page.locator("(//a[text()="Today's Deals"])[1]").

})