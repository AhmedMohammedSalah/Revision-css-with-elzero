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
        

