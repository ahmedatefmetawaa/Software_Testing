


describe('basic test1' , ()=>{

  

  it("log something" , {browser : "firefox"}, function(){   //local configration will skipped for browser
    //cy.log('hi from vscode')
    
    cy.get(".logo").should("be.visible")
    cy.get(".caption").should("have.text" , "Experience the difference")
    
  })

  it('check box click' , ()=>{
    cy.visit("/")
    cy.get('a').contains("Admin Page").click()
    cy.get('[name="username"]').type("UserName Test")
    cy.get('[name="password"]').type("Password Test")
  })



})

before ('visit the site' , ()=>{
  //cy.viewport(550 , 750)
  cy.visit("/" , {
   // qs:{
    //    q: "cypress"
   // }
  })
  cy.log("i'm inside before")
})

after ('visit the site' , ()=>{
  cy.log("i'm inside after")
})

beforeEach ('visit the site' , ()=>{
  //cy.visit("https://parabank.parasoft.com/parabank/")
  cy.log("i'm inside before each")
})

afterEach ('visit the site' , ()=>{
  //cy.log("all tests done corectly")
  cy.log("i'm inside after each")
})

context ('test case2' , function(){
  it('another test case' , ()=>{
    cy.log("i'm inside the testcase 2 ")
  } )

})
