const{test,expect}=require('@playwright/test');
test('demo',async({browser})=>{
const b= await browser.newContext();
const page= await b.newPage();
await page.goto("https://www.hyrtutorials.com/p/window-handles-practice.html",{waitUntil:'load'});

const [newPage]=await Promise.all([
 b.waitForEvent('page'),   
 page.locator("//button[@id='newTabBtn']").click()

])
const [newPage1]=await Promise.all([
 b.waitForEvent('page'),   
 page.locator("//button[@id='newTabsBtn']").click()

])
newPage.on('dialog',async dialog=>{

    console.log(dialog.message())
    await dialog.accept("playwright")
})
newPage1["Basic controls"]
await newPage1.locator("//input[@id='firstName']").fill("xxxx")
//await newPage.bringToFront();
//await newPage.locator("//button[@id='alertBox']").click()
//await newPage.waitForTimeout(4000)
//await newPage1.bringToFront();
//await newPage1.locator("//input[@id='firstName']").fill("xxxx")
//await newPage1.locator("//input[@id='lastName']").fill("yy")
//await newPage1.locator("//input[@id='femalerb']").click();
//await newPage1.locator("//input[@id='englishchbx']").click();
//await newPage1.locator("//input[@id='email']").fill("abc@gmail.com")
//await newPage1.locator("//input[@id='password']").fill("1234");
//await newPage1.locator("//button[@id='registerbtn']").click();
//await newPage1.waitForTimeout(4000)







})