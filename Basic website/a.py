from roboflow import Roboflow

rf = Roboflow(api_key="NQkKAUT6hqNh9bv7qg9N")
project = rf.workspace().project("detection-b1joi")
model = project.version("1").model

job_id, signed_url, expire_time = model.predict_video(
    0,
    fps=5,
    prediction_type="batch-video",
)

results = model.poll_until_video_results(job_id)

print(results)
