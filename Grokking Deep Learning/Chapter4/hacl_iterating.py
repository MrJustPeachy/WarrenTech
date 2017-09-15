# PROGRAM NAME: hacl_iterating.py
# PROGRAM PURPOSE: Use hot and cold learning along with iteration
# PROGRAMMER: Dillon Pietsch
# DATE WRITTEN: 8/22/2017

weight = 0.5
input = 0.5
goal_prediction = 0.8

step_amount = 0.001

for i in range(1101):
    prediction = round(input * weight, 3)
    error = round((prediction - goal_prediction) ** 2, 3)

    print("Error: " + str(error) + "\tPrediction: " + str(prediction))

    pred_up = input * (weight + step_amount)
    error_up = (goal_prediction - pred_up) ** 2

    pred_down = input * (weight - step_amount)
    error_down = (goal_prediction - pred_down) ** 2

    if error_down < error_up:
        weight -= step_amount  # If going down is better, keep on decreasing the weight
    else:
        weight += step_amount  # If going up is better, keep on increasing the weight
