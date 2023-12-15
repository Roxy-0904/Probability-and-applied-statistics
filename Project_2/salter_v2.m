% do a run of plotter_v2 first
close all

% coder changes the case number for every case
filecreate = fopen("plotting_case2.csv","r");

label = fscanf(filecreate,'%s,%s',[2 1]);
setA = fscanf(filecreate, '%f,%f',[2,maxrangenum]);
setA = setA';

%randMin = 5;
randMin= 2500
%randMax = 10;
randMax = 7500;

for i = 1:1:maxrangenum
    rand = randi([randMin,randMax]);
    tempname = setA(i,2);
    setA(i,2) = tempname + rand;
end

xvalues = setA(:,1);
y = setA(:,2);

fprintf(filecreate, '%f,%f\n', setA');
plot(xvalues,y);
set(gca, lineWidth=1,fontsize=14);
xlabel("X values");
ylabel("y");
% coder changes the case number for every case
title("Salter Graph 2");
grid on

% coder changes the case number for every case
filecreate2 = fopen("salter_case2.csv","w");
%creates the first line of file
fprintf(filecreate2,'%s,%s\n','X','Y');
fprintf(filecreate2, '%f,%f\n', setA');

fclose(filecreate);
fclose(filecreate2);