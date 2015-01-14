# SoapUiTest

Simplified test project for Web Services Testing with soapUI book (chapter 2) by Charitha Kankanamge

**Warning** This book is definitely a **bullshit** and its author is a self-promoting clumsy noob in java
despite his declared many-years-of-experience. It is not possible to use the book without
his code bundle (which I never see) because listings in the book are incomplete and contain
a number of not-evident mistakes.

That said, the book could be used by ones having some experience with Web-services, but if you
are a beginner it is better to search another manual.

I created this project to substitute "sample" of the second chapter, though it does not
use a database (so you need not install one) and has only one service instead of three with
no exceptions throwing (you can extend these things if you need).

However it is buildable project. Just run `ant` on it and when `aar` archive is at the `build`
folder - copy it to your `axis2/repository/services` subfolder, then run the server from
`axis2/bin` folder and then you can proceed with instructions from the book.

Meanwhile sane examples exist in the axis2 package itself! You may find them usable!

