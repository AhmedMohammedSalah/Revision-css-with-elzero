---------some big notes on css ---------------

1 => outline
    is an external border look like border but it cant be divide like border-bottom

---

2=> text-overflow: ellipsis;
    make some dots to the rest of word

---

3=> Inherit
    make child inherit the property from the parent

---

4=> Pseudo Elements
    ::first-letter
    ::first-line
    ::selection
    ::after => must have content =""
    ::before => must have content =""

---------------
5=> Transitions
    Transition-delay
    Transition-duration
    Transition-property
    Transition-timing-function
--------------------
6=> the margin collapse
    [1] Only Vertical margin collapse
    [2] Bigger Margin Wins
    [3] Work when there were no elements between 
    [4] Nesting does not prevent collapse
--------------------------
7=>Flex Box
    [*]Parent props
        [1] display :flex ;
            [-]display :inline-flex;
        [2] flex-direction:row<default>/col;
        [3] flex-wrap:wrap<default>/no-wrap/wrap-reverse
        [4] flex-flow:row wrap;
        [5] justify-content:flex-start<default>;
            [+] center          [+] flex-end
            [+] space-between   [+] space-around
                    [+] space-evenly
        [6] align-items:stretch <default>;
            [+] center          [+] flex-end        [+]flex-start
        [7] align-content:stretch <default>;
            [+] center          [+] flex-end        [+]flex-start
            [+] space-between   [+] space-around    [+]space-evenly
    [*]Child props
        [1]flex-grow:0 <default>;
        [2]flex-shrink:0 <default>;
        [3]order:0 <default>;
        [4]flex-basis:auto <default>;
        [short]flex :<flex-grow> <flex-shrink> <flex-basis>
        [5]align-self:stretch <default>;
            [+] center          [+] flex-end        [+]flex-start
---------------------------------------------
8=>Gradient   
    [1]syntax
        [-]background-image:linear-gradient (Direction||Angle ,color stop1,color stop2 ,.......);
        [Ex]background-image:linear-gradient (to top ,red,blue);
        [Ex]background-image:linear-gradient (70 ,red,blue,green);
        [Ex]background-image:linear-gradient (70 ,red 70%,blue 10%,green) ;
        [Elzero-Ex]>background-image:linear-gradient (
            to right ,
            #2980b9 20%,
            #27ae60 20%,
            #27ae60 40%,
            #d35400 40%,
            #d35400 60%,
            #8e44ad 60%,
            #8e44ad 80%,
            #c0392b 80%
            );
-----------------------     
9=>caret-color: red;
-----------------------     
10=>pointer-events: none;
------------------------
11=>Grid system
    [*]Parent props
        [1]display:grid;
        [2]grid-template-columns[numbers-of-columns-in]:
            [+] 3px 3px 3px [px]          [+] 20% 20% 20% 
            [+] auto auto auto            [+] repeat(3,100px)
                    [1fr]fraction is look like auto but 
                        [-]auto is shy [vs] refraction is greed
        [3]grid-template-row[numbers-of-rows-in]:  
            [+] 3px 3px 3px [px]          [+] 20% 20% 20% 
            [+] auto auto auto            [+] repeat(3,100px)
                    [1fr]fraction is look like auto but 
                        [-]auto is shy [vs] refraction is greed
        [4]gap:[row-gap] [column-gap]
            [*]gap:10px 10px;
        [5] justify-content:flex-start<default>;
            [+] center          [+] flex-end
            [+] space-between   [+] space-around
                    [+] space-evenly
        [6] align-content:stretch <default>;
            [+] center          [+] flex-end         [+]flex-start
            [+] space-between   [+] space-around    [+]space-evenly
        [7]grid-template-areas:
            "logo logo nav nav nav nav nav nav nav nav"
            "cont cont cont cont cont cont cont side side side"
            "foot foot foot foot foot foot foot foot foot foot";
    [*]Child props
        [0]grid-area:'logo';
        [1]grid-column:1/5;
            [-]grid-column:span 4 ;
            [-]grid-column:span 4 ;
            [-]grid-column:2 /span 3 ;
        [2]grid-row:1/3;
            [-]grid-row:span 1 ;
            [-]grid-row:span 1 ;
            [-]grid-row:2 /span 3 ;
        [3]grid-area:
            [grid-row-start]
            [grid-column-start]
            [grid-row-end]
            [grid-col-end];
                [-]grid-area: 1/2/2/5;
        [4]auto-fil [responsive]
        [5]minmax(min value,max value) [responsive]        
---------------------------------
 
