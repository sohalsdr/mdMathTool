# APBC-Quiz1-Cheatsheet

## Sohal Sudheer

## Formulas
### Derivatives
#### Power Rule
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
x^n \to nx^{n-1}
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
#### Product Rule
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\frac{d}{dx}[f(x)g(x)]= f(x) \times g'(x) + g(x) \times f(x)
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
#### Quotient Rule
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\frac{d}{dx}[\frac{f(x)}{g(x)}]= \frac {g(x) \times f'(x) - f(x) \times g'(x)}{g(x)^2}
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
#### Chain Rule
if <img src="https://render.githubusercontent.com/render/math?math=%24f(x)%24"> and <img src="https://render.githubusercontent.com/render/math?math=%24g(x)%24"> are both diff., and <img src="https://render.githubusercontent.com/render/math?math=%24h(x)%20%3D%20f(g(x))%24">, then
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
h'(x) = f'(g(x))\times g'(x)
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
### Limits
#### Average Rate of Change
On interval <img src="https://render.githubusercontent.com/render/math?math=%24%5Bx%2C%20x_0%5D%24">,
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\frac{f(x_0)-f(x)}{x_0-x}
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
#### Instantaneous Rate of Change
For <img src="https://render.githubusercontent.com/render/math?math=%24y%3Df(x)%24"> at <img src="https://render.githubusercontent.com/render/math?math=%24x%3Dx_0%24">
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\lim_{x \to x_0}\frac{f(x_0)-f(x)}{x_0-x}
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
#### Average Velocity
If <img src="https://render.githubusercontent.com/render/math?math=%24y%3Df(x)%24"> is the position of an object at time x,
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\frac{f(x_0)-f(x)}{x_0-x}
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
#### Instantaneous Velocity
If <img src="https://render.githubusercontent.com/render/math?math=%24y%3Df(x)%24"> is the position of an object at time x,
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\lim_{x \to x_0}\frac{f(x_0)-f(x)}{x_0-x}
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
at <img src="https://render.githubusercontent.com/render/math?math=%24x%3Dx_0%24">
## Determine Differentiability
### Prove f(x) is continuous
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\lim_{x \to c} f(x) exists
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
f(c) exists
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\lim_{x \to c} f(x) = f(c)
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
### Prove that f(x) is differentiable
Another way to say this is prove that <img src="https://render.githubusercontent.com/render/math?math=%24f'(x)%24"> exists
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\lim_{x \to c^+} f'(x) = \lim_{x \to c^-} f'(x)
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
Make sure to structure answer as proof (use <img src="https://render.githubusercontent.com/render/math?math=%24%5Ctherefore%24"> )
### Find Tangent Line to Curve
For curve <img src="https://render.githubusercontent.com/render/math?math=%24y%3Df(x)%24">
### Take the derivative of f(x)
The derivative will be the slope of the tangent line
### Find the shared point
Plug either <img src="https://render.githubusercontent.com/render/math?math=%24x%24"> or <img src="https://render.githubusercontent.com/render/math?math=%24y%24"> into the curve's equation to get a point
### Plug it in!
Plug your slope and point into point-slope formula
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
y-y_1 = m(x-x_1)
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
**Note: If you are provided a graph, if possible check and make sure your line makes sense**
#### Vertical Tangent
If you are solving for a vertical tangent, and you have a fractional equation, set the denominator of the equation equal to 0
## Implicit Differentiation
> Example: <img src="https://render.githubusercontent.com/render/math?math=%24y%5E3%20%2B%207y%20%3D%20x%5E3%24">

### Differentiate both sides of the equation with respect to x
This means when you differentiate <img src="https://render.githubusercontent.com/render/math?math=%24y%5E3%24">, it becomes <img src="https://render.githubusercontent.com/render/math?math=%243y%5E2%5Cfrac%7Bdy%7D%7Bdx%7D%24">
> Example:
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
3y^2\frac{dy}{dx}+7\frac{dy}{dx}=3x^2
<img src="https://render.githubusercontent.com/render/math?math=%24%24">

### Collect all terms with <img src="https://render.githubusercontent.com/render/math?math=%24%5Cfrac%7Bdy%7D%7Bdx%7D%24"> to one side and factor it out
> Example:
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\frac{dy}{dx}(3y^2+7)=3x^2
<img src="https://render.githubusercontent.com/render/math?math=%24%24">

### Solve for <img src="https://render.githubusercontent.com/render/math?math=%24%5Cfrac%20%7Bdy%7D%7Bdx%7D%24">
> Example:
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\frac{dy}{dx}=\frac{3x^2}{3y^2 + 7}
<img src="https://render.githubusercontent.com/render/math?math=%24%24">

## Related Rates
> Example Problem: A 26 foot long ladder starts  at 24 feet against a wall. The bottom starts slipping back at 2ft/s. How fast is the top of the ladder slipping down when the base is 10 feet away from the wall?

### Read the problem and figure out what you need to solve for
Values that are a function of time will usually be <img src="https://render.githubusercontent.com/render/math?math=%24%2Ffrac%7Bd%3F%7D%7Bdt%7D%24">
(?) is a placeholder for the variable
> Example Problem: We are looking for how fast our y value is decreasing, therefore we are looking for <img src="https://render.githubusercontent.com/render/math?math=%24%5Cfrac%7Bdy%7D%7Bdx%7D%24">

### Important: Draw a diagram
Example Problem:
![](https://imgur.com/a/awycjMI)

### Create your equation, differentiated with respect to time
> Example Problem: A triangle's sides can be found using pythagorean theorem:
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
x^2 + y^2 = z^2
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
>  Differentiated with respect to time, it would be

<img src="https://render.githubusercontent.com/render/math?math=%24%24">
2x\frac{dx}{dt}+2y\frac{dy}{dt}=2z\frac{dz}{dt} \to x\frac{dx}{dt}+y\frac{dy}{dt}=z\frac{dz}{dt}
<img src="https://render.githubusercontent.com/render/math?math=%24%24">

### Assess your variables (what you have and what you need)
> Example Problem:
<img src="https://render.githubusercontent.com/render/math?math=%24x%20%3D%2024%24">, <img src="https://render.githubusercontent.com/render/math?math=%24y%3D10%24">, <img src="https://render.githubusercontent.com/render/math?math=%24z%3D26%24">
<img src="https://render.githubusercontent.com/render/math?math=%24%5Cfrac%7Bdx%7D%7Bdt%7D%3D2%5Cfrac%7Bft%7D%7Bs%7D%24">, <img src="https://render.githubusercontent.com/render/math?math=%24%5Cfrac%7Bdy%7D%7Bdt%7D%3D%3F%24">, <img src="https://render.githubusercontent.com/render/math?math=%24%5Cfrac%7Bdz%7D%7Bdt%7D%3D0%24">

### Plug 'em in and solve!
> Example Problem:
<img src="https://render.githubusercontent.com/render/math?math=%24%24">
(24)(2) + (10)\frac{dy}{dt} = (26)(0)
<img src="https://render.githubusercontent.com/render/math?math=%24%24">

<img src="https://render.githubusercontent.com/render/math?math=%24%24">
10\frac{dy}{dt}=-48
<img src="https://render.githubusercontent.com/render/math?math=%24%24">

<img src="https://render.githubusercontent.com/render/math?math=%24%24">
\frac{dy}{dt}=-4.8\frac{ft}{s}
<img src="https://render.githubusercontent.com/render/math?math=%24%24">

## Tidbits
- '' is a derivative of a derivative, ''' is a derivative of a derivative of a derivative, so on and so forth
- Show **perfect** work for everything except multiple choice questions
