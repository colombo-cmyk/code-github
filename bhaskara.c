#include <stdio.h>
#include <math.h>

void bhaskara(double x1, double x2, double x3, double d, double *r1, double *r2)
{

    if (d < 0 || x1 == 0)
    {
        printf("Impossível calcular\n");
    }
    else
    {
        *r1 = (-x2 + sqrt(d)) /( 2 * x1);
        *r2 = (-x2 - sqrt(d))/ (2 * x1);
         printf("R1 = %.5lf\n", *r1);
         printf("R2 = %.5lf\n", *r2);
    }

}

int main()
{

    double a = 0.0, b = 0.0, c = 0.0, r1 = 0.0, r2 = 0.0;

    scanf("%lf %lf %lf", &a, &b, &c);
    double delta = (b * b) - (4 * a * c);

    bhaskara(a, b, c, delta, &r1, &r2);
   

    return 0;
}