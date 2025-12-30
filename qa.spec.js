const{test,expect}=require('@playwright/test');
const path = require('path');
test('demo',async({browser})=>{
    const b = await browser.newContext();
    const page= await b.newPage();
    await page.goto("https://demoqa.com/text-box",{waitUntil:'load'});
    await page.locator("//input[@id='userEmail']").fill("abc@getMaxListeners.com");
    await page.locator("//textarea[@placeholder='Current Address']").fill("2/6 coimbatore");
    await page.locator("//textarea[@id='permanentAddress']").fill("2/6 coimbatore");
    await page.locator("//button[@id='submit']").click();
    await page.screenshot({path:'C:\\Users\\ADMIN\\Desktop\\playwright\\trail.png'});
    await page.evaluate(()=>window.scrollTo(0,document.body.scrollHeight));
});