describe('basic test1' , ()=>{

['iphone-8' , 'ipad-2' ,'macbook-13' ].forEach(
    (viewport)=>{
        it('view port' , ()=>{
            cy.visit("/")
            cy.viewport(viewport)
        
        })
    }
)


})