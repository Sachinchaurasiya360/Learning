import PropTypes from 'prop-types';
import Video from './Video'; // Make sure the Video component is correctly imported

function VideoList({ videos, emptyHeading }) {
  const count = videos.length;
  let heading = emptyHeading;
  if (count > 0) {
    const noun = count > 1 ? 'Videos' : 'Video';
    heading = count + ' ' + noun;
  }
  return (
    <section>
      <h2>{heading}</h2>
      {videos.map(video =>
        <Video key={video.id} video={video} />
      )}
    </section>
  );
}

VideoList.propTypes = {
  videos: PropTypes.arrayOf(PropTypes.object).isRequired,
  emptyHeading: PropTypes.string.isRequired,
};

export default VideoList;
