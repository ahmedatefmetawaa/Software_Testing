

describe('find elements by get command'  , ()=> {

    it('get tagname' , ()=>{
        cy.visit("/")
        cy.get('img')
    })

    it('get class' , ()=>{
        cy.visit("/")
        cy.get('.Solutions')
    })

    it('get id' , ()=>{
        cy.visit("/")
        cy.get('#mainPanel')
    })

    it('get any attribute(name - type ect...)' , ()=>{
        cy.visit("/")
        cy.get('[title="ParaBank"]')
    })

    it('get first element of group of elements have the same attribute' , ()=>{
        cy.visit("/")
        cy.get('.leftmenu').first
    })

    it('get  element of group of elements by index' , ()=>{
        cy.visit("/")
        cy.get('a').eq(5)
    })

    it('get  element of group of elements have the same attribute by filter' , ()=>{
        cy.visit("/")
        cy.get('ul').filter('.button')
        
    })
    it('get element of group of elements have the same attribute by children' , ()=>{
        cy.visit("/")
        cy.get('.leftmenu').children()
        cy.get('.leftmenu').children().first()
        cy.get('.leftmenu').children().last()
        cy.get('.leftmenu').children().eq(4)
        
    })

    it('get element of group of elements have the same attribute by parent' , ()=>{
        cy.visit("/")
        cy.get('.Solutions').parent()
        
    })

    it('find command like children ' , ()=>{
        cy.visit("/")
        cy.get('.leftmenu').find('.Solutions')
        
    })

    it('get parents of all the element in an array ' , ()=>{
        cy.visit("/")
        cy.get('.Solutions').parents()
        
    })

    it('get siblings of all the element in the same level "list" ' , ()=>{
        cy.visit("/")
        cy.get('.Solutions').siblings()
            
    })
 
    it('get element by text' , ()=>{
        cy.visit("/")
        cy.contains('About Us')            
    })

    it('find element by cypress runner ' , ()=>{
        cy.visit("/")
        cy.get('.home > a')         
    })

    it('click ' , ()=>{
        cy.visit("/")
        cy.get('.aboutus > a').click()        
    })

    it('multiple click ' , ()=>{
        cy.visit("/")
        cy.get('.button').click({multiple: true})        
    })
    
    it('force click (click element even hidden) ' , ()=>{
        cy.visit("/")
        cy.get('.button').click({force: true})        
    })
    it('type command' , ()=>{
        cy.visit("/")
        cy.get('[name = username]').type('ahmedatef@gmail{enter}' , {delay : 1000})       
    })

    it('select command' , ()=>{
        cy.visit("/")
        cy.get('.leftmenu > :nth-child(6) > a').click()
        cy.get('#loanProvider').select('jms')      
    })

    it('check and uncheck command(for type checkbox and radio only)' , ()=>{
        cy.visit("/")
        cy.get('.leftmenu > :nth-child(6) > a').click()
        cy.get('#accessMode1').check()    
        cy.get('#accessMode1').uncheck()   // for checkboxes only
    })
    it('double and right click' , ()=>{
        cy.visit("/")
        cy.get('#accessMode1').dblclick()     // no example
        cy.get('#accessMode1').rightclick()
    })

    it('focus and blur' , ()=>{
        cy.visit("/")
        cy.get('[name="username"]').focus()
        cy.get('[name="username"]').blur()
    })
    it('mouse hover' , ()=>{
        cy.visit("/")
        cy.get('[name="username"]').trigger('mouseover')  // hover 
        cy.get('[name="username"]').trigger('mouseout')  // not hover 
        cy.get('[name="username"]').trigger('mousedown')  // long press  
      
    })

    it('should command' , ()=>{
        cy.visit("/")
        cy.get('[title="ParaBank"]').should('be.visible')   // visible
        cy.get('.caption').should('have.text' , 'Experience the difference') //assert text
    })

    it('should command' , ()=>{
        cy.visit("/")
      //  cy.get('.caption').should('contain' , 'Experience ') // asseret some text
      cy.get('.caption').should('have.class' , 'caption') // assert element has specific class 
    })

    it('should css' , ()=>{
        cy.visit("/")
      cy.get('.captionone').should('have.css' , 'background' , 'rgb(255, 255, 255)') 
    })

    it('url command ' , ()=>{
        cy.visit("/")
        cy.url().should('contain' , 'https://parabank.parasoft.com/')

    })

    it('get title' , ()=>{
        cy.visit("/")
        cy.title().should('eql' ,  'cypressParaBank | Welcome | Online Banking')

    })
    it('back and forward' , ()=>{
        cy.visit("/")
        cy.visit("https://www.google.com/")
        cy.delay('1000')
        cy.go('back')
    })
    it('get or set cokies ' , ()=>{
        cy.visit("/")
        cy.getCookie('JSESSIONID').should('have.property' , 'value' , '245E09137D9FAAFEAF5DDF8F1FDA3B99')
               // cy.getCookies()

    })
        it('clock command ' , ()=>{
        let now = new Date('2024 06 25')
        cy.clock(now)
        cy.visit("/")
       
        // cy.getCookies()

    })
    it('wrap command to assert non cypres elements  ' , ()=>{
     //JS code       
    const student = {
        namee: 'ahmed',
        family: 'ali',
        isQA : true
        }
        const message = "welcome to egypt"
        cy.wrap(student).should('have.property' , 'namee' , 'ahmed')
        cy.wrap(message).should('eql' , 'welcome to egypt')
        cy.get(student).should('have.property' , 'namee' , 'ahmed') // will give an error
        cy.visit("/")
       
        // cy.getCookies()

    })

    it('its command access properties only ' , ()=>{
        //JS code       
       const student = {
           namee: 'ahmed',
           family: 'ali',
           isQA : true,
           is_watching : function(){      // method
            console.log("he is watching")
           }
           }
           const message = "welcome to egypt"
           cy.visit("/")
           cy.wrap(student).its('family').should('eql' , 'ali')
   
           
          
           // cy.getCookies()
   
       })

       it.only('invoke command access methods  ' , ()=>{
        //JS code       
       const student = {
           namee: 'ahmed',
           family: 'ali',
           isQA : true,
           is_watching : function(){      // method
            //console.log("he is watching")
            return 'Hello ' + this.namee   // we need return that invoke command shoud get it back
           }
           }
           const message = "welcome to egypt"
           cy.visit("/")
           cy.wrap(student).invoke('is_watching')          
           // cy.getCookies()
   
       })
})

